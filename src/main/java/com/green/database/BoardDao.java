package com.green.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

// Data Access Object (DB 작업을 하는 객체)
public class BoardDao {

    public int insBoard(Board board) {
        int result = 0;
        String sql = "INSERT INTO board" + // " " 안에서 작성중 스페이스바로 작성을하면
                // +와 같이 다음줄에서 문자를 이어 쓸 수 있다.
                " SET title = ? " +
                " , contents = ?" +
                " , writer = ? ";
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {
            // ;은 구분의 역할 너무길어서 엔터를 했다고?
            ps.setString(1, board.getTitle());
            // sql의 1번 ?에 해당문장을 넣는것
            ps.setString(2, board.getContents());
            ps.setString(3, board.getWriter());
            // 실제로는 이러한 작업들을 생략되어 한번에 작성할 수 있음
            // 처음해보는 것이라 어떤식으로 돌아가는지 보기 위하여

            result = ps.executeUpdate(); // 쿼리 실행
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int delBoard(int boardId) {
        int result = 0;
        String sql = "DELETE " +
                "FROM board " +
                "WHERE board_id = ? ";
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, boardId);
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int updBoard(Board board) {
        int result = 0;
        String sql = "UPDATE board " +
                " SET title = ? " +
                " , contents = ?" +
                " , writer = ?" +
                " where board_id = ? ";
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, board.getTitle());
            ps.setString(2, board.getContents());
            ps.setString(3, board.getWriter());
            ps.setInt(4, board.getBoardId());

            result = ps.executeUpdate(); // 쿼리 실행
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int updBoard2(Board board) {
        int result = 0;
        StringBuilder sb = new StringBuilder();
        if (board.getTitle() != null && !board.getTitle().equals("")) {
            // !"".equals(board.getTitle())로 하는게 더 좋았다. null 값이 들어오는것을 대비하여
            // 위의 경우에는 앞에서 null채크를 해줬지만 다른경우에는 안했을 때 문제가 생길 수 있음
            sb.append(String.format(", title = '%s' ", board.getTitle()));
        }
        if (board.getContents() != null && !"".equals(board.getContents())) {
            sb.append(String.format(", contents = '%s' ", board.getContents()));
        }
        if (board.getWriter() != null && !"".equals(board.getWriter())) {
            sb.append(String.format(", writer = '%s' ", board.getWriter()));
        }
//        sb.deleteCharAt(0); // title contents writer 어느것이 앞에 나오던 간에 ,만 빼면 되므로
        String sql = String.format("UPDATE board SET %s WHERE board_id = %d", sb.deleteCharAt(0), board.getBoardId());
        System.out.println(sql);

        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)) {
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public List<Board> selBoardList() {
        List<Board> list = new ArrayList<>();
        String sql = "SELECT board_id, title, writer, created_at FROM board " +
//                "ORDER BY created_at DESC";
                "ORDER BY board_id DESC"; // 데이터량이 많아지면 속도 차이가 나버림
        try (Connection conn = MyConnection.getConn()
             ; PreparedStatement ps = conn.prepareStatement(sql)
             ; ResultSet rs = ps.executeQuery()) {
            // 얘만 executeQuery 인 것은 앞에 up de in 은 자료를 내가 알고 넣는것이지만
            // select는 내가 모르는 자료를 받기 위함이므로
            while(rs.next()){
                Board board = new Board();
                list.add(board); // 주소값이라 위에넣나 아래에넣나 상관x
                board.setBoardId(rs.getInt("board_id"));
                String title = rs.getString("title");
                board.setTitle(title);
                board.setWriter(rs.getString("writer"));
                board.setCreatedAt(rs.getString("created_at"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public Board selBoard(int boardId){
        //어떤값을 보내서 튜플을 받아야 하니
        String sql = "SELECT board_id, title, contents, writer, created_at " +
                "FROM board " +
                "WHERE board_id = ? " ;

        ResultSet rs = null;
        try(Connection conn = MyConnection.getConn()
            ; PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,boardId);
            rs = ps.executeQuery();

            while(rs.next()){
                Board board = new Board();
                board.setBoardId(rs.getInt("board_id"));
                String title = rs.getString("title");
                board.setTitle(title);
                board.setContents(rs.getString("contents"));
                board.setWriter(rs.getString("writer"));
                board.setCreatedAt(rs.getString("created_at"));
                return  board;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(rs != null){
                try{rs.close();} catch (Exception e){ e.printStackTrace();}
            }
        }
        return null;
    }
}
