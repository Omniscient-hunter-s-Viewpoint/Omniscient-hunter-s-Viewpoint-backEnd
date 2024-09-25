package com.spring.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="tbl_member")
public class Member {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long member_id;
    private long member_password;
    private long member_email;
    private long member_name;
}
