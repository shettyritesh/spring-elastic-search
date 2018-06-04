**Pre requisites**   

Java 
	1.8 . You need to set the PATH and JAVA_HOME env parameters  

Maven:
	https://maven.apache.org/install.html .   
	I used version 3.5.3   


**Hints**:
	You can pull the code into editor of your choice.   
	Using 'mvn eclipse:eclipse' will generate metadata so that you can pull the code into eclipse  


**Compile and Unit Test**:  
	mvn clean test  

**Running the Code**:
	By default the server will come up on localhost. 
	Use following command to start the server  
	 mvn spring-boot:run	 
	 To run the Code in Docker 	 
	 Build a docker image
	 docker build --tag=pc-plans .
	 docker run -p 18080:8080 -t -i -e SERVER_IP='0.0.0.0' pc-plans

**Test**
http://<serverip:18080>/search?sponsorState=NC&planName=CONSULTING
 

{
    "plans": [
        {
            "id": "AWO8i9GZDV3hIpZ_XgL_",
            "spons_Dfe_Loc_Us_State": "NC",
            "ACK_ID": "20180101115412P040000039321001",
            "SPONSOR_DFE_NAME": "DOVE CONSULTING CORP",
            "SPONS_DFE_LOC_US_STATE": "NC",
            "PLAN_NAME": "DOVE CONSULTING CORP. RETIREMENT PLAN"
        }
    ],
    "totalPages": 1
}

Optional Query Parameters

pageRequest=3
pageSize=5


	
**Setting up K8s on AWS**
There are many ways to setup a cluster on AWS we can use kops
https://github.com/kubernetes/kops/blob/master/docs/aws.md	

**TODO**
Need to add instructions to deploy the code to a Kubernetes cluster on AWS   	
	
	  
**Known Issues**  
Need to configure the code to work with external elastic search server  
Deployment to AWS is pending.  
