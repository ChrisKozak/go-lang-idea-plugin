// This is a generated file. Not intended for manual editing.
package com.goide.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GoMethodDeclaration extends GoFunctionDeclaration {

  @Nullable
  GoFunction getFunction();

  @NotNull
  GoReceiver getReceiver();

  @Nullable
  GoSignature getSignature();

  @NotNull
  PsiElement getFunc();

  @Nullable
  PsiElement getIdentifier();

}