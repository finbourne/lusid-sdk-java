# LUSID<sup>®</sup> Java SDK

This repository enables the generation of a Java SDK from the FINBOURNE OpenAPI specification using the [autorest](https://github.com/Azure/autorest) tool.

A generated version of the SDK is included in the `lusid-sdk-java` folder based on the OpenAPI specification named `lusid.json` in the root folder.  The most up to date version of the OpenAPI specification can be downloaded from https://api.finbourne.com/swagger/v0/swagger.json

In addtion to the SDK, a set of examples on how to use the SDK can be found in the [src/test/java](https://github.com/finbourne/lusid-sdk-java/tree/master/lusid-sdk-java/src/test/java) folder.  These exist in the form of unit tests and further instructions on running the tests can be found in the [README](https://github.com/finbourne/lusid-sdk-java/blob/master/lusid-sdk-java/readme.md).

# Generating the SDK

The preferred method of generating the SDK is using `docker` and `docker-compose` by running the following command: 

```
$ docker-compose up && docker-compose rm -f
```

If `docker` is not available then the SDK can be generated using `autorest` natively using the following command, ensuring this `README.md` is in the same folder as the command is run from:

```
$ autorest --java --use=@microsoft.azure/autorest.modeler@2.3.40
```

For other options on installation see [Installing AutoRest](https://aka.ms/autorest/install) on the AutoRest github page.

> see https://aka.ms/autorest

# Client Runtimes
https://github.com/Azure/autorest/blob/master/docs/developer/architecture/Autorest-and-Clientruntimes.md

---

## Configuration 
The following are the settings for this using this API with AutoRest.

``` yaml
input-file: lusid.json
add-credentials: true
output-folder: ./lusid-sdk-java/src/main/java/com/finbourne
namespace: com.finbourne
license-header: "Copyright © 2018 FINBOURNE TECHNOLOGY LTD


Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the \"Software\"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:


The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.


THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE."

```
