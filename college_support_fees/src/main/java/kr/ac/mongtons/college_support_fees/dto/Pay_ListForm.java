package kr.ac.mongtons.college_support_fees.dto;

import kr.ac.mongtons.college_support_fees.domain.entity.Pay_List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Pay_ListForm {
    private Integer id;
    private String subject;
    private Integer num;
    private String name;
    public Pay_List toEntity(){
        return new Pay_List(id, subject, num, name);
    }
}
