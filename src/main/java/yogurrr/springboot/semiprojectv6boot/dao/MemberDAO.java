package yogurrr.springboot.semiprojectv6boot.dao;

import yogurrr.springboot.semiprojectv5.model.Member;

public interface MemberDAO {
    int selectLogin(Member m);
}
