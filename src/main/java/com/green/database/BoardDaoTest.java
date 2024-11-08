package com.green.database;

import java.util.Arrays;
import java.util.List;

public class BoardDaoTest {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();

        Board board = null;
        if(args.length >0) {
            board = new Board();
            board.setTitle(args[0]);
            board.setContents(args[1]);
            board.setWriter(args[2]);
            if(args.length == 4){
                board.setBoardId(Integer.parseInt(args[3]));
                // args가 3개 > 값을 삽입 4개>수정
                // 왜냐하면 삽입할때는 pk를 보내지 않으므로(수정할때는 필수)
            }
        }
//        insert(dao,board);
//        delete(dao);
//        update(dao,board);
//        update2(dao,board);
//        selectAll(dao);
        selectOne(dao,3);
        // args 사용법 12시 실행 왼쪽커서에서 Edit Config
        // program arguments 에 글자 입력
        // 띄어쓰기 할때마다 다음 배열칸에 입력
        // 예시로
        // aa bb cc라고 적으면 args[0]에는 aa args[1]에는 bb args[2]에는 cc가 들어감
        // 내부에서 따로 띄어쓰기를 주고싶으면 " "를 주고나서 내용을 입력하면 됨
    }

    private static void insert(BoardDao dao,Board board){

        int result = dao.insBoard(board);
        System.out.println(result);
    }
    private static void delete(BoardDao dao){
        int result = dao.delBoard(1);
    }
    private static void update(BoardDao dao, Board board){
        int result = dao.updBoard(board);
        System.out.println(result);
    }

    private static void update2(BoardDao dao, Board board){
        int result = dao.updBoard2(board);
        System.out.println(result);
    }
    private static void selectAll(BoardDao dao){
        List<Board> list = dao.selBoardList();
        for(Board a : list){
            System.out.println(a);
        }
//        System.out.println(list);
    }
    private static void selectOne(BoardDao dao, int boardId){
        Board board = dao.selBoard(boardId);
        System.out.println(board);
    }
}
