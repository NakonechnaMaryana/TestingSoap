package LibraryUse;

import DataImport.*;

import java.awt.print.Book;
import java.math.BigInteger;
import java.util.List;

public class LibraryPortUse {
  public static void main(String[] args) {
      LibraryPortService service = new LibraryPortService();
      LibraryPort library = service.getLibraryPortSoap11();

      GetAuthorsRequest request = new GetAuthorsRequest();
      SearchParamsWithPagination search = new SearchParamsWithPagination();
      search.setSize(7);
      search.setOrderType("asc");
      search.setPagination(true);
      search.setPage(BigInteger.valueOf(1));
      request.setSearch(search);

      GetAuthorsResponse response = library.getAuthors(request);
      List<AuthorType> authors = response.getAuthors().getAuthor();
      System.out.println(authors);

    }
}
