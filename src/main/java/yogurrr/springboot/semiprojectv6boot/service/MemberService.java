package yogurrr.springboot.semiprojectv6boot.service;

import yogurrr.springboot.semiprojectv5.model.Member;

import javax.servlet.http.HttpSession;

public interface MemberService {
    boolean checkLogin(Member m, HttpSession sess);
}
