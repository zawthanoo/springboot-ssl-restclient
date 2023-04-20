# springboot3-resttemplate-https

generate public certificate as below.

```sh
keytool -export -keystore <<FILE_PATH>>/YOUR.p12 -alias mutu -file <<FILE_PATH>>/YOUR.crt -validity 3650
```
```sh
keytool -import -file <<FILE_PATH>>/YOUR.crt -alias mutu -keystore <<FILE_PATH>>/YOUR.jks
```
put `YOUR.jks` file into `src/main/resources` directory.

**Related**: [springboot3-template](https://github.com/zawthanoo/springboot3-template)
