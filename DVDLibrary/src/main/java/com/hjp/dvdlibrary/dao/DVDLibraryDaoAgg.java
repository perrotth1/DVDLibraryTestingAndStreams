package com.hjp.dvdlibrary.dao;

import com.hjp.dvdlibrary.dto.DVD;
import java.util.List;

/**
 *
 * @author Henry
 */
public interface DVDLibraryDaoAgg extends DVDLibraryDao {
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

    public List<DVD> searchDVDByStudio(String _studio) throws DVDLibraryDaoException;

    public double getAverageAgeOfMovies();
}
