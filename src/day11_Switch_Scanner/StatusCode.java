package day11_Switch_Scanner;

public class StatusCode {


    public static void main(String[] args) {

        int statusCode=503;
        String result="";

        if (statusCode==200){
            result="OK";
        } else if(statusCode==201){

            result="Created";
        } else if(statusCode==202){
            result="Accepted";
        } else if(statusCode==301){
            result="Moved Permanently";

        }else if(statusCode==303){
            result="See Other";
        } else if(statusCode==304){
            result="Not Modified";
        } else if(statusCode==307){

            result="Temporary Redirect";
        } else if(statusCode==400){
            result="Bad Request";
        } else if(statusCode==401){
            result="Unauthorised";
        } else if(statusCode==403){
            result="Forbidden";

        } else if(statusCode==404){
            result="Not Found";
        } else if(statusCode==410){
            result="Gone";
        } else if(statusCode==500){
            result="Internet Server Error";
        } else if(statusCode==503){
            result="Service Unavailable";
        } else{
            result="Invalid Entry";
        }

        System.out.println(result);
    }
}


/*
5. HTTP is the protocol that governs communications between web-
servers and web clients. Part of the protocol includes a status code
returned by the server to tell the browser the status of its most recent
page request.
Some of the codes and their meanings are listed below:
status code:
200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable
declare an int variable called StatusCode, write a switch that
prints out, on a line by itself, the appropriate label from the above list
based on status.
Example:
if status code = 200
output:
ok
 */