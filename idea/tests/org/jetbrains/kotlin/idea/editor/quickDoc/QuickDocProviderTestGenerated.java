/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.editor.quickDoc;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/editor/quickDoc")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class QuickDocProviderTestGenerated extends AbstractQuickDocProviderTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInQuickDoc() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/editor/quickDoc"), Pattern.compile("^([^_]+)\\.(kt|java)$"), null, true);
    }

    @TestMetadata("AnonymousObjectLocalVariable.kt")
    public void testAnonymousObjectLocalVariable() throws Exception {
        runTest("idea/testData/editor/quickDoc/AnonymousObjectLocalVariable.kt");
    }

    @TestMetadata("AtConstantWithUnderscore.kt")
    public void testAtConstantWithUnderscore() throws Exception {
        runTest("idea/testData/editor/quickDoc/AtConstantWithUnderscore.kt");
    }

    @TestMetadata("AtFunctionParameter.kt")
    public void testAtFunctionParameter() throws Exception {
        runTest("idea/testData/editor/quickDoc/AtFunctionParameter.kt");
    }

    @TestMetadata("AtImplicitLambdaParametEnd.kt")
    public void testAtImplicitLambdaParametEnd() throws Exception {
        runTest("idea/testData/editor/quickDoc/AtImplicitLambdaParametEnd.kt");
    }

    @TestMetadata("AtImplicitLambdaParameter.kt")
    public void testAtImplicitLambdaParameter() throws Exception {
        runTest("idea/testData/editor/quickDoc/AtImplicitLambdaParameter.kt");
    }

    @TestMetadata("AtLocalFunction.kt")
    public void testAtLocalFunction() throws Exception {
        runTest("idea/testData/editor/quickDoc/AtLocalFunction.kt");
    }

    @TestMetadata("AtTypeParameter.kt")
    public void testAtTypeParameter() throws Exception {
        runTest("idea/testData/editor/quickDoc/AtTypeParameter.kt");
    }

    @TestMetadata("AtVariableDeclaration.kt")
    public void testAtVariableDeclaration() throws Exception {
        runTest("idea/testData/editor/quickDoc/AtVariableDeclaration.kt");
    }

    @TestMetadata("ConstructorVarParameter.kt")
    public void testConstructorVarParameter() throws Exception {
        runTest("idea/testData/editor/quickDoc/ConstructorVarParameter.kt");
    }

    @TestMetadata("DeprecationWithReplaceInfo.kt")
    public void testDeprecationWithReplaceInfo() throws Exception {
        runTest("idea/testData/editor/quickDoc/DeprecationWithReplaceInfo.kt");
    }

    @TestMetadata("EscapeHtmlInsideCodeBlocks.kt")
    public void testEscapeHtmlInsideCodeBlocks() throws Exception {
        runTest("idea/testData/editor/quickDoc/EscapeHtmlInsideCodeBlocks.kt");
    }

    @TestMetadata("ExtensionReceiver.kt")
    public void testExtensionReceiver() throws Exception {
        runTest("idea/testData/editor/quickDoc/ExtensionReceiver.kt");
    }

    @TestMetadata("ExtensionReceiverEnd.kt")
    public void testExtensionReceiverEnd() throws Exception {
        runTest("idea/testData/editor/quickDoc/ExtensionReceiverEnd.kt");
    }

    @TestMetadata("IndentedCodeBlock.kt")
    public void testIndentedCodeBlock() throws Exception {
        runTest("idea/testData/editor/quickDoc/IndentedCodeBlock.kt");
    }

    @TestMetadata("JavaClassUsedInKotlin.kt")
    public void testJavaClassUsedInKotlin() throws Exception {
        runTest("idea/testData/editor/quickDoc/JavaClassUsedInKotlin.kt");
    }

    @TestMetadata("JavaDocFromOverridenClass.kt")
    public void testJavaDocFromOverridenClass() throws Exception {
        runTest("idea/testData/editor/quickDoc/JavaDocFromOverridenClass.kt");
    }

    @TestMetadata("JavaDocFromOverridenInterface.kt")
    public void testJavaDocFromOverridenInterface() throws Exception {
        runTest("idea/testData/editor/quickDoc/JavaDocFromOverridenInterface.kt");
    }

    @TestMetadata("JavaMethodUsedInKotlin.kt")
    public void testJavaMethodUsedInKotlin() throws Exception {
        runTest("idea/testData/editor/quickDoc/JavaMethodUsedInKotlin.kt");
    }

    @TestMetadata("KotlinClassUsedFromJava.java")
    public void testKotlinClassUsedFromJava() throws Exception {
        runTest("idea/testData/editor/quickDoc/KotlinClassUsedFromJava.java");
    }

    @TestMetadata("KotlinPackageClassUsedFromJava.java")
    public void testKotlinPackageClassUsedFromJava() throws Exception {
        runTest("idea/testData/editor/quickDoc/KotlinPackageClassUsedFromJava.java");
    }

    @TestMetadata("Lateinit.kt")
    public void testLateinit() throws Exception {
        runTest("idea/testData/editor/quickDoc/Lateinit.kt");
    }

    @TestMetadata("LateinitName.kt")
    public void testLateinitName() throws Exception {
        runTest("idea/testData/editor/quickDoc/LateinitName.kt");
    }

    @TestMetadata("MethodFromStdLib.kt")
    public void testMethodFromStdLib() throws Exception {
        runTest("idea/testData/editor/quickDoc/MethodFromStdLib.kt");
    }

    @TestMetadata("OnClassDeclarationWithNoPackage.kt")
    public void testOnClassDeclarationWithNoPackage() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnClassDeclarationWithNoPackage.kt");
    }

    @TestMetadata("OnEnumClassReference.kt")
    public void testOnEnumClassReference() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnEnumClassReference.kt");
    }

    @TestMetadata("OnEnumDeclaration.kt")
    public void testOnEnumDeclaration() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnEnumDeclaration.kt");
    }

    @TestMetadata("OnEnumEntry.kt")
    public void testOnEnumEntry() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnEnumEntry.kt");
    }

    @TestMetadata("OnEnumEntryUsage.kt")
    public void testOnEnumEntryUsage() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnEnumEntryUsage.kt");
    }

    @TestMetadata("OnEnumUsage.kt")
    public void testOnEnumUsage() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnEnumUsage.kt");
    }

    @TestMetadata("OnEnumValueOfFunction.kt")
    public void testOnEnumValueOfFunction() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnEnumValueOfFunction.kt");
    }

    @TestMetadata("OnEnumValuesFunction.kt")
    public void testOnEnumValuesFunction() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnEnumValuesFunction.kt");
    }

    @TestMetadata("OnFunctionDeclarationWithPackage.kt")
    public void testOnFunctionDeclarationWithPackage() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnFunctionDeclarationWithPackage.kt");
    }

    @TestMetadata("OnInheritedMethodUsage.kt")
    public void testOnInheritedMethodUsage() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnInheritedMethodUsage.kt");
    }

    @TestMetadata("OnInheritedPropertyUsage.kt")
    public void testOnInheritedPropertyUsage() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnInheritedPropertyUsage.kt");
    }

    @TestMetadata("OnMethodUsage.kt")
    public void testOnMethodUsage() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnMethodUsage.kt");
    }

    @TestMetadata("OnMethodUsageMultiline.kt")
    public void testOnMethodUsageMultiline() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnMethodUsageMultiline.kt");
    }

    @TestMetadata("OnMethodUsageWithBracketsInParam.kt")
    public void testOnMethodUsageWithBracketsInParam() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnMethodUsageWithBracketsInParam.kt");
    }

    @TestMetadata("OnMethodUsageWithCodeBlock.kt")
    public void testOnMethodUsageWithCodeBlock() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnMethodUsageWithCodeBlock.kt");
    }

    @TestMetadata("OnMethodUsageWithMarkdown.kt")
    public void testOnMethodUsageWithMarkdown() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnMethodUsageWithMarkdown.kt");
    }

    @TestMetadata("OnMethodUsageWithMultilineParam.kt")
    public void testOnMethodUsageWithMultilineParam() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnMethodUsageWithMultilineParam.kt");
    }

    @TestMetadata("OnMethodUsageWithReceiver.kt")
    public void testOnMethodUsageWithReceiver() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnMethodUsageWithReceiver.kt");
    }

    @TestMetadata("OnMethodUsageWithReturnAndLink.kt")
    public void testOnMethodUsageWithReturnAndLink() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnMethodUsageWithReturnAndLink.kt");
    }

    @TestMetadata("OnMethodUsageWithReturnAndThrows.kt")
    public void testOnMethodUsageWithReturnAndThrows() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnMethodUsageWithReturnAndThrows.kt");
    }

    @TestMetadata("OnMethodUsageWithSee.kt")
    public void testOnMethodUsageWithSee() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnMethodUsageWithSee.kt");
    }

    @TestMetadata("OnMethodUsageWithTypeParameter.kt")
    public void testOnMethodUsageWithTypeParameter() throws Exception {
        runTest("idea/testData/editor/quickDoc/OnMethodUsageWithTypeParameter.kt");
    }

    @TestMetadata("Samples.kt")
    public void testSamples() throws Exception {
        runTest("idea/testData/editor/quickDoc/Samples.kt");
    }

    @TestMetadata("Tailrec.kt")
    public void testTailrec() throws Exception {
        runTest("idea/testData/editor/quickDoc/Tailrec.kt");
    }

    @TestMetadata("TailrecName.kt")
    public void testTailrecName() throws Exception {
        runTest("idea/testData/editor/quickDoc/TailrecName.kt");
    }

    @TestMetadata("TopLevelMethodFromJava.java")
    public void testTopLevelMethodFromJava() throws Exception {
        runTest("idea/testData/editor/quickDoc/TopLevelMethodFromJava.java");
    }

    @TestMetadata("TypeNamesFromStdLibNavigation.kt")
    public void testTypeNamesFromStdLibNavigation() throws Exception {
        runTest("idea/testData/editor/quickDoc/TypeNamesFromStdLibNavigation.kt");
    }
}
