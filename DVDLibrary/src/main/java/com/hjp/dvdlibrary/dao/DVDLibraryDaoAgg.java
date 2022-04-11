package com.hjp.dvdlibrary.dao;

import java.util.List;
import com.hjp.dvdlibrary.dto.*;
/**
 *
 * @author Henry
 */
public interface DVDLibraryDaoAgg extends DVDLibraryDao {
    
    List<DVD> getDVDInLastNYears(int _years);
    List<DVD> getDVDByRating(String _rating);
    List<DVD> getDVDByDirector(String _director);
    
    /**
     * 
    Find all movies released in the last N years
    Find all the movies with a given MPAA rating
    Find all the movies by a given director
    When searching by director, the movies should be sorted into separate data structures by MPAA rating.
    Find all the movies released by a particular studio
    Find the average age of the movies in the collection
    Find the newest movie in your collection
    Find the oldest movie in your collection
    Find the average number of notes associated with movies in your collection
     */
}
