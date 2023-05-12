package yogurrr.springboot.semiprojectv6.dao;

import yogurrr.springboot.semiprojectv6.model.Member;
import yogurrr.springboot.semiprojectv6.model.Zipcode;

import java.util.List;

public interface JoinDAO {
    List<Zipcode> selectZipcode(String dong);
    int insertMember(Member m);
    int selectOneUserid(String uid);
    int selectOneMember(Member m);
}
