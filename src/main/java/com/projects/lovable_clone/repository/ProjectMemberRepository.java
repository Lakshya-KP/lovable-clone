package com.projects.lovable_clone.repository;

import com.projects.lovable_clone.entity.ProjectMember;
import com.projects.lovable_clone.entity.ProjectMemberId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProjectMemberRepository extends JpaRepository<ProjectMember, Long> {

    List<ProjectMember> findByIdProjectId(Long projectId);

    boolean existsById(ProjectMemberId projectMemberId);

    Optional<ProjectMember> findById(ProjectMemberId projectMemberId);

    void deleteById(ProjectMemberId projectMemberId);
}
