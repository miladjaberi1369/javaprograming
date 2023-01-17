package HomeWork;

public class day08_Http_is_the_protocol {

   public static void main(String[] args) {
        int statusCode = 304;
        String result = "";
        switch (statusCode) {
            case 200:
                result = "ok";
                break;
            case 201:
                result = "Created";
                break;
            case 202:
                result = "Accepted";
                break;
            case 301:
                result = "Moved Permanently";
                break;
            case 303:
                result = "See Other";
                break;
            case 304:
                result = "Not Modified";
                break;
            case 307:
                result = "Temporary Redirect";
                break;
            case 401:
                result = "Unauthorized";
                break;
            case 403:
                result = "Forbidden";
                break;
            case 404:
                result = "Not Found";
                break;
            case 410:
                result = "Gone";
                break;
            case 500:
                result = "Internal Server Error";
                break;
            case 503:
                result = "Service Unavailable";
                break;
            default:
                result = "invalid input";
                System.out.println(result);

                //   result = statusCode == 200 ? "ok" :
                //          statusCode == 201 ? "Created" :
                //        statusCode == 202 ? "Accepted" :
                //      statusCode == 301 ? "Moved Permanently" :
                //    statusCode == 303 ? "See Other" :
                // "invalid input";
                System.out.println(result);
        }
    }
}
//    8. HTTP is the protocol that governs communications between web-servers and web clients.
//    Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
//    Some of the codes and their meanings are listed below:
//
//    status codes and their meanings:
//            200, OK
//	                201, Created
//	                202, Accepted
//	                301, Moved Permanently
//	                303, See Other
//	                304, Not Modified
//	                307, Temporary Redirect
//	                400, Bad Request
//	                401, Unauthorized
//	                403, Forbidden
//	                404, Not Found
//	                410, Gone
//	                500, Internal Server Error
//	                503, Service Unavailable
//
//
//    declare an int variable called statusCode, and a valid status code is already given
//    write a program that prints out, on a line by itself, the appropriate label from the above list based on status.
//
//            Example:
//            if status code = 200
//
//    output:
//    ok
//
//    Solution 1: Must use ternary
//    Solution 2:	MUST use switch statement

