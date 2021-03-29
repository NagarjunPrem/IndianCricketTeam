# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM glassfish:latest

# $DEPLOY_DIR is where payara looks for applications
COPY ./target/asg3-1.0-SNAPSHOT.war $DEPLOY_DIR