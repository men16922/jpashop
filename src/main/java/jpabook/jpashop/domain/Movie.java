package jpabook.jpashop.domain;

import lombok.Data;

import javax.persistence.Entity;

/**
 * packageName    : jpabook.jpashop.domain
 * fileName       : Movie
 * author         : men16
 * date           : 2022-10-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-10-30        men16       최초 생성
 */

@Data
@Entity
public class Movie extends Item{
    private String director;
    private String actor;
}

