package kr.ac.mongtons.college_support_fees.domain.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pay_list")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pay_List {
    @Id
    public Integer id;
    @Column(length=10, nullable = false)
    public String subject;
    @Column(nullable = true)
    public Integer num;
    @Column(length = 10, nullable = false)
    public String name;
}
