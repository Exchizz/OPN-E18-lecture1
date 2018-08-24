# :> 
This code will output "hello world" followed by the hostname of the PC where the code is run. If this code is run from a docker container, the hostname of that container can be set using --hostname.
example:
 ```
$ docker run --hostname mycontainer mneerup/java_example
```

Output:
```
Hello world from host: mycontainer
```

