# Project for "Architecture of parallel computing systems" subject

### Commands ###
* Start web service (from root dir)
>  ./mvnw spring-boot:run
* Generate jar file 
> ./mvnw clean package
* Send simple soap request, write output to file and show pretty printed response (test dir)
> curl -fsSL --header "content-type: text/xml" -d @request.xml http://localhost:9090/ws > output.xml && xmllint --format output.xml