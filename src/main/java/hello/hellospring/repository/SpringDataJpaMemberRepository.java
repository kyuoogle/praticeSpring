package hello.hellospring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import hello.hellospring.domain.Member;

// select m from Member m where m.name = ?
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

	@Override
	Optional<Member> findByName(String name);


}
