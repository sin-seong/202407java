package com.board.service;


import com.board.db.UserDao;
import com.board.db.UserDto;

public class UserService {
	
	public void regMsg(
            String name, String email, String ssn)
                    throws Exception {

        if (name  == null || name.length()  == 0 ||
            ssn   == null || ssn.length()   == 0 ||
            email == null || email.length() == 0) {

           throw new Exception("모든 항목이 빈칸 없이 입력되어야 합니다.");
        }

        UserDto dto = new UserDto();
        dto.setName (name);
        dto.setEmail(email);
        dto.setSsn  (ssn);
        

        new UserDao().insertOne(dto);
}
}