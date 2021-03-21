package com.ossec.ventewebsite.repository;

import com.ossec.ventewebsite.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
