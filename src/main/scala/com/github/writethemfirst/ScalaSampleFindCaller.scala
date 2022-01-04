package com.github.writethemfirst

import java.util.Optional

import com.github.writethemfirst.approvals.utils.stack.JavaDefaultFindCaller

/** This class only serves as a POC for language or framework-specific implementations.
  *
  * See also src/main/resources/META-INF/services/com.github.writethemfirst.approvals.utils.stack.FindCaller
  */
class ScalaSampleFindCaller extends JavaDefaultFindCaller {

  override def callerClass(potentialReferenceClasses: Class[_]*): String = {
    super.callerClass(potentialReferenceClasses: _*)
  }

  override def callerMethod(referenceClassName: String): Optional[String] = {
    super.callerMethod(referenceClassName)
  }
}
