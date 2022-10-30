package jpabook.jpashop.domain;

import lombok.Data;

import javax.persistence.Entity;

/**
 * packageName    : jpabook.jpashop.domain
 * fileName       : Album
 * author         : men16
 * date           : 2022-10-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-10-30        men16       최초 생성
 */
@Entity
@Data
public class Album extends Item{
    private String artist;
    private String etc;
}

