package org.example.project.b;

import org.example.project.a.ClassFromA;

public class ClassFromB
{
  public ClassFromB() {
    new ClassFromA();
  }

  @Override
  public String toString()
  {
    return super.toString();
  }

  @Override
  public int hashCode()
  {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj)
  {
    return super.equals(obj);
  }
}
