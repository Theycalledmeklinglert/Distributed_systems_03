package de.fhws.fiw.fds.exam02.tests.nginx;

import de.fhws.fiw.fds.exam02.client.IBaseUrl;
import de.fhws.fiw.fds.exam02.client.rest.RestApiResponse;
import de.fhws.fiw.fds.exam02.client.rest.resources.TestClient;
import de.fhws.fiw.fds.exam02.client.web.WebApiResponse;
import de.fhws.fiw.fds.exam02.tests.models.Student;
import de.fhws.fiw.fds.exam02.tests.models.StudyTrip;
import de.fhws.fiw.fds.exam02.tests.util.headers.HeaderMap;
import de.fhws.fiw.fds.exam02.tests.util.headers.HeaderMapUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GetSingleStudyTripCacheTest {
    /*
    private final static String URL = IBaseUrl.BASE_URL;
    public final static String UPDATE_STUDENT = "updateStudent";

    public final static String DELETE_STUDENT = "deleteStudent";

    @Test
    public void test_200( ) throws IOException
    {
        TestClient client = new TestClient("Admin", "secret", HeaderMapUtils.withAcceptJson( ));

        final WebApiResponse<StudyTrip> response = client.sendGetSingleRequest( URL + "studytrips/2");

        assertEquals( 200, response.getLastStatusCode( ) );

        final Optional<StudyTrip> studyTripOpt = response.getFirstResponse();

        assertNotNull( studyTripOpt );

        StudyTrip studyTrip = studyTripOpt.get();

        assertEquals( 2, studyTrip.getId( ) );
        assertEquals( "University of Mumbai", studyTrip.getCompanyName( ) );
        assertEquals( "India", studyTrip.getCountryName( ) );
        assertEquals( "2000-02-10", studyTrip.getEndDate( ) );
        assertEquals( "2000-01-10", studyTrip.getStartDate( ) );
        assertEquals( "Indienreise 2000", studyTrip.getName( ) );
        assertEquals( "Admin", studyTrip.getOrganizer( ) );
        assertEquals("http://localhost/exam03/api/studytrips/2", studyTrip.getStudents());      // TODO: Check
        assertEquals("http://localhost/exam03/api/studytrips/2/students", studyTrip.getSelfLink());     // TODO: check
    }

    @Test
    public void test_hypermedia( ) throws IOException
    {
        final RestApiResponse<Student> response = getSingleRequestById( HeaderMapUtils.withAcceptJson( ), 1, userName, password );

        checkLinkHeaders( response );
    }

    private void checkLinkHeaders( final RestApiResponse<Student> response )
    {
        assertLinkHeaderEquals( response, UPDATE_STUDENT, BASE_URL + "students/{id}" );
        assertLinkHeaderEquals( response, DELETE_STUDENT, BASE_URL + "students/{id}" );
        assertLinkHeaderEquals( response, SELF, BASE_URL + "students/1" );
    }

    @Test
    public void test_correct_media_type( ) throws IOException
    {
        final RestApiResponse<Student> response = getSingleRequestById( HeaderMapUtils.withAcceptJson( ), 1, userName, password  );

        assertEquals( 200, response.getLastStatusCode( ) );
    }

    @Test
    public void test_incorrect_media_type( ) throws IOException
    {
        final RestApiResponse<Student> response = getSingleRequestById( HeaderMapUtils.withAcceptXml( ), 1, userName, password  );

        assertEquals( 406, response.getLastStatusCode( ) );
    }

    @Test
    public void test_conditional_get_304( ) throws IOException
    {
        //user A loads a student
        final RestApiResponse<Student> responseFromFirstGetRequest = getSingleRequestById( HeaderMapUtils.withAcceptJson( ), 1, userName, password  );

        assertHeaderExists( responseFromFirstGetRequest, ETAG );

        final String etag = responseFromFirstGetRequest.getEtagHeader( );

        //user A revalidates
        final HeaderMap headersForSecondGetRequest = HeaderMapUtils.withAcceptJson( );
        headersForSecondGetRequest.addHeader( IF_NONE_MATCH, etag );

        final RestApiResponse<Student> responseFromSecondGetRequest = getSingleRequestById( headersForSecondGetRequest, 1, userName, password  );

        assertEquals( 304, responseFromSecondGetRequest.getLastStatusCode( ) );
    }

    @Test
    public void test_conditional_get_200( ) throws IOException
    {
        //user A loads a student
        final RestApiResponse<Student> responseFromFirstGetRequest = getSingleRequestById( HeaderMapUtils.withAcceptJson( ), 1, userName, password  );
        final Student student = responseFromFirstGetRequest.getResponseSingleData( );

        assertHeaderExists( responseFromFirstGetRequest, ETAG );

        final String initialEtag = responseFromFirstGetRequest.getEtagHeader( );

        //user B updates this resource
        student.setFirstName( "Robert" );

        final HeaderMap headersForPutRequestForUserB = HeaderMapUtils.withContentTypeJson( );
        headersForPutRequestForUserB.addHeader( IF_MATCH, initialEtag );

        final RestApiResponse<Student> responseFromPutRequest = putRequest( headersForPutRequestForUserB, student, userName, password  );

        assertEquals( 204, responseFromPutRequest.getLastStatusCode( ) );

        final String newEtag = responseFromPutRequest.getEtagHeader( );

        //user A revalidates using old etag
        final HeaderMap headersForSecondGetRequest = HeaderMapUtils.withAcceptJson( );
        headersForSecondGetRequest.addHeader( IF_NONE_MATCH, initialEtag );

        final RestApiResponse<Student> responseFromSecondGetRequest = getSingleRequestById( headersForSecondGetRequest, 1, userName, password  );

        assertEquals( 200, responseFromSecondGetRequest.getLastStatusCode( ) );
        assertNotNull( responseFromSecondGetRequest.getResponseSingleData( ) );
    }


     */



}
