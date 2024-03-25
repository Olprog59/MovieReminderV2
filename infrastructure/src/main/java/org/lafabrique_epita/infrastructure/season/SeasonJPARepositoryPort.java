package org.lafabrique_epita.infrastructure.season;

import org.lafabrique_epita.domain.entities.SeasonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonJPARepositoryPort extends JpaRepository<SeasonEntity, Long> {
}