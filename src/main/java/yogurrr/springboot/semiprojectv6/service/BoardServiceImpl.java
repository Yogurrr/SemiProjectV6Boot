package yogurrr.springboot.semiprojectv6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yogurrr.springboot.semiprojectv6.dao.BoardDAO;
import yogurrr.springboot.semiprojectv6.model.Board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("bdsrv")
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDAO bddao;

    @Override
    public List<Board> readBoard(int cpage) {
        int stbno = (cpage - 1) * 25;
        return bddao.selectBoard(stbno);
    }

    @Override
    public List<Board> readBoard(int cpage, String ftype, String fkey) {
        int stbno = (cpage - 1) * 25;

        // 처리 시 사용할 데이터들을 해쉬맵에 담아서 보냄
        Map<String, Object> params = new HashMap<>();   // mybatis는 이름으로 받아오는데 이처럼 이름으로 받아올 수 있는 유일한 자료구조
        params.put("stbno", stbno);
        params.put("ftype", ftype);
        params.put("fkey", fkey);

        return bddao.selectBoard(params);
    }

    @Override
    public int countBoard() {
        return bddao.countBoard();
    }

    @Override
    public int countBoard(String ftype, String fkey) {
        Map<String, Object> params = new HashMap<>();
        params.put("ftype", ftype);
        params.put("fkey", fkey);

        return bddao.countBoard(params);
    }

    @Override
    public boolean newBoard(Board bd) {
        boolean result = false;
        if (bddao.insertBoard(bd) > 0) result = true;

        return result;
    }

    @Override
    public Board readOneBoard(String bno) {
        return bddao.selectOneBoard(bno);
    }
}
