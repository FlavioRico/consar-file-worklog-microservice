package mx.com.multiva.sipare.repository;

import mx.com.multiva.sipare.model.FileWorklog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileWorklogRepository extends JpaRepository<FileWorklog, String> {

}
