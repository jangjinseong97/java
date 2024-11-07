package com.green.database;

import java.sql.Connection;
import java.sql.PreparedStatement;

// Data Access Object (DB 작업을 하는 객체)
public class BoardDao {

    public int insBoard(Board board){
        int result = 0;
        String sql = "INSERT INTO board" + // " " 안에서 작성중 스페이스바로 작성을하면
                // +와 같이 다음줄에서 문자를 이어 쓸 수 있다.
                " SET title = ? " +
                " , contents = ?" +
                " , writer = ? ";
        try(Connection conn = MyConnection.getConn()
            ; PreparedStatement ps = conn.prepareStatement(sql)){
            // ;은 구분의 역할 너무길어서 엔터를 했다고?
            ps.setString(1, board.getTitle());
            // sql의 1번 ?에 해당문장을 넣는것
            ps.setString(2, board.getContents());
            ps.setString(3, board.getWriter());
            // 실제로는 이러한 작업들을 생략되어 한번에 작성할 수 있음
            // 처음해보는 것이라 어떤식으로 돌아가는지 보기 위하여

            result = ps.executeUpdate(); // 쿼리 실행
        } catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public int delBoard(int boardId){
        int result = 0;
        String sql = "DELETE " +
                "FROM board " +
                "WHERE board_id = ? ";
        try(Connection conn = MyConnection.getConn()
            ; PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,boardId);
            result = ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
