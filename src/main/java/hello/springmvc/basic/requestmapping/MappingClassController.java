package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    /**
     * 회원 목록 조회: GET `/users`
     * 회원 등록: POST `/users`
     * 회원 조회: GET `/users/{userId}`
     * 회원 수정: PATCH `/users/{userId}`
     * 회원 삭제: DELETE `/users/{userId}'
     */

    @GetMapping
    public String users(){
        return "get users";
    }

    @PostMapping
    public String addUser(){
        return "post user";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable Long userId){
        return "get user" + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable Long userId){
        return "update user"  + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable Long userId){
        return "delete user" + userId;
    }
}
