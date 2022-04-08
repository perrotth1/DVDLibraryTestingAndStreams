package com.hjp.dvdlibrary.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.hjp.dvdlibrary.dao.*;
import com.hjp.dvdlibrary.dto.*;
import java.io.FileWriter;

/**
 *
 * @author Henry
 */
public class DVDLibraryDaoFileImplTest {
    
    /**
     *  TEST PLAN
     * 
     *  testAddGetDVD(DVD dvd) - Add a DVD, get it and prove it was added by checking the data is equal
     */
    
    private DVDLibraryDao testDao;
    
    public DVDLibraryDaoFileImplTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() throws Exception{
        //Before each test, wipe the test txt file and re-initialize testDao
        new FileWriter("TEST_LIBRARY.txt");
        this.testDao = new DVDLibraryDaoFileImpl("TEST_LIBRARY.txt");      
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAddGetDVD() throws Exception{
        //ARRANGE
        DVD newDVD = new DVD("title","release","rating","director","studio","note");
        testDao.addDVD(newDVD);
        
        //ACT
        DVD retrievedDVD = testDao.getDVD(newDVD.getTitle());
        
        //ASSERT
        assertEquals(newDVD, retrievedDVD);
    }
    
}
