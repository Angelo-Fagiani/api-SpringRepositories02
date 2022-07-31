package it.develhope.apiSpringRepositories02.repositories;

import it.develhope.apiSpringRepositories02.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages",
collectionResourceDescription = @Description("repo-prog-languages description")) //NECESSARIO PER MODIFICARE IL PATH A NOSTRO PIACIMENTO
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Long> {
}
