package com.study.CRUD_Test.repository;
import com.study.CRUD_Test.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MemberRepository extends JpaRepository<Member, String>{
}
