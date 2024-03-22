package org.lafabrique_epita.exposition.dto.movie_post;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.List;

public record MoviePostResponseDto(
        Long id,

        @JsonProperty("id_tmdb")
        Long idTmdb,

        @NotNull
        @NotBlank
        String title,

        Integer duration,

        String overview,

        @JsonProperty("poster_path")
        String backdropPath,

        Float score,

        List<GenreMoviePostDto> genres,

        @JsonProperty("release_date")
        LocalDate releaseDate,

        List<CommentDto> comments

) {
}