scalaVersion := "2.11.2"

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"

// this is required for compiling static (non-abstract) methods in java interfaces - scalac chokes on them
compileOrder := CompileOrder.JavaThenScala
