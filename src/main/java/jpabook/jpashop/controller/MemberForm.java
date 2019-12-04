package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * Entity를 form으로 받으면 실무에서 복잡해짐, form 따로 만드는걸 추천
 */
@Getter @Setter
public class MemberForm {

    @NotEmpty(message = "회원 이름은 필수 입니다")
    private String name;

    private String city;
    private String street;
    private String zipcode;
}
