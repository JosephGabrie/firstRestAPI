package Group9.Final.Atempt.Repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import Group9.Final.Atempt.Models.Book;

public interface BookRepo extends JpaRepository <Book, Long>{
    List<Book> findTop10ByOrderBySoldCopiesDesc();
    
}
