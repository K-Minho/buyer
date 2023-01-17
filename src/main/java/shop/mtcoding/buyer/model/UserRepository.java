package shop.mtcoding.buyer.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/*
 * 회원가입, 로그인, 회원탈퇴, 회원수정
 */
@Mapper
public interface UserRepository { // CRUD를 사용하지 않더라도 만들어두고 더 필요한걸 체크하는 것이 좋음
    public int insert(String username, String password, String email);

    public List<User> findAll();

    public User findById(int id);

    public int updateFindById(int id);

    public int deleteFindById(int id);

    public int updateUserFindById(int id, String password, String email);

    public User login(String username, String password);

}
