# Project for "Architecture of parallel computing systems" subject
## Part 1. SOAP service

### Commands ###
* Start web service (execute from root dir)
>  ./mvnw spring-boot:run
* Generate jar file (execute from root dir)
> ./mvnw clean package 
* Send simple soap request, write output to file and show pretty printed response (execute from test dir)
> curl -fsSL --header "content-type: text/xml" -d @request.xml http://localhost:9090/ws > output.xml && xmllint --format output.xml


### TEST EXAMPLE ###
Request:

![request](https://i.postimg.cc/NMC4C4dz/carbon-7.png)

Response:

![response](https://i.postimg.cc/vTj0Tz9V/carbon-6.png)