#README

## BEFORE YOU START
Building this is non-trivial. It's NOT gonna work on a non-enterprise windows machine, and might be a ballache on a Mac too, so you'll probably want to spin up an AWS Ubuntu 18 LTS EC2 instance to use as a build server. 

Nothing Fancy, standard small instance should be fine, but also bear in mind, with Docker virtualising this for the python Deps, you'll also probably wanna procure 30GB of disk space for that machine as well. 

* AWS Ubuntu 18 LTS EC2 small instance
* 30GB of disk space

###Build server reqs
* AWS CLI installed (might be there already)
* IAM user setup in AWS.
* IAM user in place on build server.
  * > aws configure
* Node 10
* Python 3.7
* Docker / Docker CLI
* JDK 8 or greater 
* maven installed

## installing node deps.
These are installed with a standard npm install.

_From main project folder._
> npm install

## installing node deps per NODE layer.
Again, standard npm install, but this time inside the nodelibs[0/1/2]/nodejs folder.

_From main project folder._
> cd nodelibs[0/1/2]/nodejs
> npm install

## installing python deps.
These will be installed from the accompanying requirements.txt file.

Requires:
* Python 3.7 runtime
* PIP installed
* Docker (for deploy and layer packing)

_From main project folder._
> pip install -r requirements.txt




## Installing java deps
These are managed with Maven.

Requires:
* JDK 8 or greater 
* maven installed

_From main project folder._
> mvn package


