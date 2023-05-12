package yogurrr.springboot.semiprojectv6boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yogurrr.springboot.semiprojectv5.dao.MemberDAO;
import yogurrr.springboot.semiprojectv5.model.Member;

import javax.servlet.http.HttpSession;

@Service("msrv")
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberDAO mdao;

    @Override
    public boolean checkLogin(Member m, HttpSession sess) {
        boolean isLogin = false;
        // 로그인 가능 여부 확인
        if (mdao.selectLogin(m) > 0) {
            // 로그인 가능하면 세션변수에 아이디를 저장
            sess.setAttribute("UID", m.getUserid());
            isLogin = true;
        }

        return isLogin;
    }
}
