package yogurrr.springboot.semiprojectv6.dao;

import yogurrr.springboot.semiprojectv6.model.Member;

public interface MemberDAO {
    int selectLogin(Member m);
}
