# Generated from CPP14Parser.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CPP14Parser import CPP14Parser
else:
    from CPP14Parser import CPP14Parser

# This class defines a complete generic visitor for a parse tree produced by CPP14Parser.


class CPP14Visitor(ParseTreeVisitor):

    def visitAllChildren(self, ctx):
        output = ""
        for child in ctx.children:
            if not child.getChildCount():
                output += child.getText() + " "
            else:
                output += self.visit(child)
        return output

    # Visit a parse tree produced by CPP14Parser#translationUnit.

    def visitTranslationUnit(self, ctx: CPP14Parser.TranslationUnitContext):
        output = "#include <stdio.h>\n"
        for child in ctx.children:
            if not child.getChildCount():
                if child.getText() == "<EOF>":
                    output += ""
                else:
                    output += child.getText() + " "
                # print(output)
            else:

                output += self.visit(child)

        return output

    # Visit a parse tree produced by CPP14Parser#primaryExpression.
    def visitPrimaryExpression(self, ctx: CPP14Parser.PrimaryExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#idExpression.
    def visitIdExpression(self, ctx: CPP14Parser.IdExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#unqualifiedId.
    def visitUnqualifiedId(self, ctx: CPP14Parser.UnqualifiedIdContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#qualifiedId.
    def visitQualifiedId(self, ctx: CPP14Parser.QualifiedIdContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#nestedNameSpecifier.
    def visitNestedNameSpecifier(self, ctx: CPP14Parser.NestedNameSpecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#lambdaExpression.
    def visitLambdaExpression(self, ctx: CPP14Parser.LambdaExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#lambdaIntroducer.
    def visitLambdaIntroducer(self, ctx: CPP14Parser.LambdaIntroducerContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#lambdaCapture.
    def visitLambdaCapture(self, ctx: CPP14Parser.LambdaCaptureContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#captureDefault.
    def visitCaptureDefault(self, ctx: CPP14Parser.CaptureDefaultContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#captureList.
    def visitCaptureList(self, ctx: CPP14Parser.CaptureListContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#capture.
    def visitCapture(self, ctx: CPP14Parser.CaptureContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#simpleCapture.
    def visitSimpleCapture(self, ctx: CPP14Parser.SimpleCaptureContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#initcapture.
    def visitInitcapture(self, ctx: CPP14Parser.InitcaptureContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#lambdaDeclarator.
    def visitLambdaDeclarator(self, ctx: CPP14Parser.LambdaDeclaratorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#postfixExpression.
    def visitPostfixExpression(self, ctx: CPP14Parser.PostfixExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#typeIdOfTheTypeId.
    def visitTypeIdOfTheTypeId(self, ctx: CPP14Parser.TypeIdOfTheTypeIdContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#expressionList.
    def visitExpressionList(self, ctx: CPP14Parser.ExpressionListContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#pseudoDestructorName.
    def visitPseudoDestructorName(self, ctx: CPP14Parser.PseudoDestructorNameContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#unaryExpression.
    def visitUnaryExpression(self, ctx: CPP14Parser.UnaryExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#unaryOperator.
    def visitUnaryOperator(self, ctx: CPP14Parser.UnaryOperatorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#newExpression.
    def visitNewExpression(self, ctx: CPP14Parser.NewExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#newPlacement.
    def visitNewPlacement(self, ctx: CPP14Parser.NewPlacementContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#newTypeId.
    def visitNewTypeId(self, ctx: CPP14Parser.NewTypeIdContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#newDeclarator.
    def visitNewDeclarator(self, ctx: CPP14Parser.NewDeclaratorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#noPointerNewDeclarator.
    def visitNoPointerNewDeclarator(self, ctx: CPP14Parser.NoPointerNewDeclaratorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#newInitializer.
    def visitNewInitializer(self, ctx: CPP14Parser.NewInitializerContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#deleteExpression.
    def visitDeleteExpression(self, ctx: CPP14Parser.DeleteExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#noExceptExpression.
    def visitNoExceptExpression(self, ctx: CPP14Parser.NoExceptExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#castExpression.
    def visitCastExpression(self, ctx: CPP14Parser.CastExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#pointerMemberExpression.
    def visitPointerMemberExpression(self, ctx: CPP14Parser.PointerMemberExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#multiplicativeExpression.
    def visitMultiplicativeExpression(self, ctx: CPP14Parser.MultiplicativeExpressionContext):
        output = ""
        for child in ctx.children:
            if not child.getChildCount():
                output += child.getText() + " "
            else:
                output += self.visit(child)
        #output+= "end"
        return output

    # Visit a parse tree produced by CPP14Parser#additiveExpression.
    def visitAdditiveExpression(self, ctx: CPP14Parser.AdditiveExpressionContext):
        output = ""
        for child in ctx.children:
            if not child.getChildCount():
                output += child.getText() + " "
            else:
                output += self.visit(child)
                output += ""
        output += ""
        return output

    # Visit a parse tree produced by CPP14Parser#shiftExpression.
    def visitShiftExpression(self, ctx: CPP14Parser.ShiftExpressionContext):
        output = ""
        flag = False
        for child in ctx.children:
            if not child.getChildCount():
                output += child.getText() + " "
            else:
                if "cout" in self.visit(child):
                    output += "printf("
                    flag = True
                elif "<" in self.visit(child):
                    output += " "
                elif "cin" in self.visit(child):
                    output += "scanf("
                    flag = True
                elif ">" in self.visit(child):
                    output += " "
                else:
                    output += self.visit(child)
                #output+= "oO"
        #output+= "end"
        if flag:
            output += ")"
        return output

    # Visit a parse tree produced by CPP14Parser#shiftOperator.
    def visitShiftOperator(self, ctx: CPP14Parser.ShiftOperatorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#relationalExpression.
    def visitRelationalExpression(self, ctx: CPP14Parser.RelationalExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#equalityExpression.
    def visitEqualityExpression(self, ctx: CPP14Parser.EqualityExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#andExpression.
    def visitAndExpression(self, ctx: CPP14Parser.AndExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#exclusiveOrExpression.
    def visitExclusiveOrExpression(self, ctx: CPP14Parser.ExclusiveOrExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#inclusiveOrExpression.
    def visitInclusiveOrExpression(self, ctx: CPP14Parser.InclusiveOrExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#logicalAndExpression.
    def visitLogicalAndExpression(self, ctx: CPP14Parser.LogicalAndExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#logicalOrExpression.
    def visitLogicalOrExpression(self, ctx: CPP14Parser.LogicalOrExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#conditionalExpression.
    def visitConditionalExpression(self, ctx: CPP14Parser.ConditionalExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#assignmentExpression.
    def visitAssignmentExpression(self, ctx: CPP14Parser.AssignmentExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#assignmentOperator.
    def visitAssignmentOperator(self, ctx: CPP14Parser.AssignmentOperatorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#expression.
    def visitExpression(self, ctx: CPP14Parser.ExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#constantExpression.
    def visitConstantExpression(self, ctx: CPP14Parser.ConstantExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#statement.
    def visitStatement(self, ctx: CPP14Parser.StatementContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#labeledStatement.
    def visitLabeledStatement(self, ctx: CPP14Parser.LabeledStatementContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#expressionStatement.
    def visitExpressionStatement(self, ctx: CPP14Parser.ExpressionStatementContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#compoundStatement.
    def visitCompoundStatement(self, ctx: CPP14Parser.CompoundStatementContext):
        output = ""
        for child in ctx.children:
            if not child.getChildCount():
                output += child.getText() + "\n"
            else:
                output += self.visit(child)
        return output

    # Visit a parse tree produced by CPP14Parser#statementSeq.
    def visitStatementSeq(self, ctx: CPP14Parser.StatementSeqContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#selectionStatement.
    def visitSelectionStatement(self, ctx: CPP14Parser.SelectionStatementContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#condition.
    def visitCondition(self, ctx: CPP14Parser.ConditionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#iterationStatement.
    def visitIterationStatement(self, ctx: CPP14Parser.IterationStatementContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#forInitStatement.
    def visitForInitStatement(self, ctx: CPP14Parser.ForInitStatementContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#forRangeDeclaration.
    def visitForRangeDeclaration(self, ctx: CPP14Parser.ForRangeDeclarationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#forRangeInitializer.
    def visitForRangeInitializer(self, ctx: CPP14Parser.ForRangeInitializerContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#jumpStatement.
    def visitJumpStatement(self, ctx: CPP14Parser.JumpStatementContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#declarationStatement.
    def visitDeclarationStatement(self, ctx: CPP14Parser.DeclarationStatementContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#declarationseq.
    def visitDeclarationseq(self, ctx: CPP14Parser.DeclarationseqContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#declaration.
    def visitDeclaration(self, ctx: CPP14Parser.DeclarationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#blockDeclaration.
    def visitBlockDeclaration(self, ctx: CPP14Parser.BlockDeclarationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#aliasDeclaration.
    def visitAliasDeclaration(self, ctx: CPP14Parser.AliasDeclarationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#simpleDeclaration.
    def visitSimpleDeclaration(self, ctx: CPP14Parser.SimpleDeclarationContext):
        output = ""
        children_iter = iter(ctx.children)
        for i, child in enumerate(children_iter):
            if "string" in child.getText():
                output += "char "
                declarationStat = ctx.children[i+1].getText()

                position = declarationStat.find("=")
                new_character = '[] = '

                temp = list(declarationStat)
                temp[position] = new_character
                declarationStat = "".join(temp)
                # print(declarationStat)
                output += declarationStat
                next(children_iter)
            elif not child.getChildCount():
                output += child.getText() + "\n"
                #output+= "child"
            else:
                output += self.visit(child)
                #output+= "child"

        return output

    # Visit a parse tree produced by CPP14Parser#staticAssertDeclaration.
    def visitStaticAssertDeclaration(self, ctx: CPP14Parser.StaticAssertDeclarationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#emptyDeclaration.
    def visitEmptyDeclaration(self, ctx: CPP14Parser.EmptyDeclarationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#attributeDeclaration.
    def visitAttributeDeclaration(self, ctx: CPP14Parser.AttributeDeclarationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#declSpecifier.
    def visitDeclSpecifier(self, ctx: CPP14Parser.DeclSpecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#declSpecifierSeq.
    def visitDeclSpecifierSeq(self, ctx: CPP14Parser.DeclSpecifierSeqContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#storageClassSpecifier.
    def visitStorageClassSpecifier(self, ctx: CPP14Parser.StorageClassSpecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#functionSpecifier.
    def visitFunctionSpecifier(self, ctx: CPP14Parser.FunctionSpecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#typedefName.
    def visitTypedefName(self, ctx: CPP14Parser.TypedefNameContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#typeSpecifier.
    def visitTypeSpecifier(self, ctx: CPP14Parser.TypeSpecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#trailingTypeSpecifier.
    def visitTrailingTypeSpecifier(self, ctx: CPP14Parser.TrailingTypeSpecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#typeSpecifierSeq.
    def visitTypeSpecifierSeq(self, ctx: CPP14Parser.TypeSpecifierSeqContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#trailingTypeSpecifierSeq.
    def visitTrailingTypeSpecifierSeq(self, ctx: CPP14Parser.TrailingTypeSpecifierSeqContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#simpleTypeLengthModifier.
    def visitSimpleTypeLengthModifier(self, ctx: CPP14Parser.SimpleTypeLengthModifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#simpleTypeSignednessModifier.
    def visitSimpleTypeSignednessModifier(self, ctx: CPP14Parser.SimpleTypeSignednessModifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#simpleTypeSpecifier.
    def visitSimpleTypeSpecifier(self, ctx: CPP14Parser.SimpleTypeSpecifierContext):
        output = ""
        for child in ctx.children:
            if "std" in child.getText():
                output += ""
            elif "::" in child.getText():
                output += ""
            elif not child.getChildCount():
                output += child.getText() + " "
            else:
                output += self.visit(child)
        return output

    # Visit a parse tree produced by CPP14Parser#theTypeName.
    def visitTheTypeName(self, ctx: CPP14Parser.TheTypeNameContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#decltypeSpecifier.
    def visitDecltypeSpecifier(self, ctx: CPP14Parser.DecltypeSpecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#elaboratedTypeSpecifier.
    def visitElaboratedTypeSpecifier(self, ctx: CPP14Parser.ElaboratedTypeSpecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#enumName.
    def visitEnumName(self, ctx: CPP14Parser.EnumNameContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#enumSpecifier.
    def visitEnumSpecifier(self, ctx: CPP14Parser.EnumSpecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#enumHead.
    def visitEnumHead(self, ctx: CPP14Parser.EnumHeadContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#opaqueEnumDeclaration.
    def visitOpaqueEnumDeclaration(self, ctx: CPP14Parser.OpaqueEnumDeclarationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#enumkey.
    def visitEnumkey(self, ctx: CPP14Parser.EnumkeyContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#enumbase.
    def visitEnumbase(self, ctx: CPP14Parser.EnumbaseContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#enumeratorList.
    def visitEnumeratorList(self, ctx: CPP14Parser.EnumeratorListContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#enumeratorDefinition.
    def visitEnumeratorDefinition(self, ctx: CPP14Parser.EnumeratorDefinitionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#enumerator.
    def visitEnumerator(self, ctx: CPP14Parser.EnumeratorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#namespaceName.
    def visitNamespaceName(self, ctx: CPP14Parser.NamespaceNameContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#originalNamespaceName.
    def visitOriginalNamespaceName(self, ctx: CPP14Parser.OriginalNamespaceNameContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#namespaceDefinition.
    def visitNamespaceDefinition(self, ctx: CPP14Parser.NamespaceDefinitionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#namespaceAlias.
    def visitNamespaceAlias(self, ctx: CPP14Parser.NamespaceAliasContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#namespaceAliasDefinition.
    def visitNamespaceAliasDefinition(self, ctx: CPP14Parser.NamespaceAliasDefinitionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#qualifiednamespacespecifier.
    def visitQualifiednamespacespecifier(self, ctx: CPP14Parser.QualifiednamespacespecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#usingDeclaration.
    def visitUsingDeclaration(self, ctx: CPP14Parser.UsingDeclarationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#usingDirective.
    def visitUsingDirective(self, ctx: CPP14Parser.UsingDirectiveContext):
        output = ""
        for child in ctx.children:
            if child.getText() == "std":
                output = ""

                return output
            if not child.getChildCount():
                output += child.getText() + " "
            else:
                output += self.visit(child) + " "

        return output

    # Visit a parse tree produced by CPP14Parser#asmDefinition.
    def visitAsmDefinition(self, ctx: CPP14Parser.AsmDefinitionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#linkageSpecification.
    def visitLinkageSpecification(self, ctx: CPP14Parser.LinkageSpecificationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#attributeSpecifierSeq.
    def visitAttributeSpecifierSeq(self, ctx: CPP14Parser.AttributeSpecifierSeqContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#attributeSpecifier.
    def visitAttributeSpecifier(self, ctx: CPP14Parser.AttributeSpecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#alignmentspecifier.
    def visitAlignmentspecifier(self, ctx: CPP14Parser.AlignmentspecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#attributeList.
    def visitAttributeList(self, ctx: CPP14Parser.AttributeListContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#attribute.
    def visitAttribute(self, ctx: CPP14Parser.AttributeContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#attributeNamespace.
    def visitAttributeNamespace(self, ctx: CPP14Parser.AttributeNamespaceContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#attributeArgumentClause.
    def visitAttributeArgumentClause(self, ctx: CPP14Parser.AttributeArgumentClauseContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#balancedTokenSeq.
    def visitBalancedTokenSeq(self, ctx: CPP14Parser.BalancedTokenSeqContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#balancedtoken.
    def visitBalancedtoken(self, ctx: CPP14Parser.BalancedtokenContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#initDeclaratorList.
    def visitInitDeclaratorList(self, ctx: CPP14Parser.InitDeclaratorListContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#initDeclarator.
    def visitInitDeclarator(self, ctx: CPP14Parser.InitDeclaratorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#declarator.
    def visitDeclarator(self, ctx: CPP14Parser.DeclaratorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#pointerDeclarator.
    def visitPointerDeclarator(self, ctx: CPP14Parser.PointerDeclaratorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#noPointerDeclarator.
    def visitNoPointerDeclarator(self, ctx: CPP14Parser.NoPointerDeclaratorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#parametersAndQualifiers.
    def visitParametersAndQualifiers(self, ctx: CPP14Parser.ParametersAndQualifiersContext):
        output = ""
        for child in ctx.children:
            if not child.getChildCount():
                output += child.getText()
            else:
                output += self.visit(child)
        return output

    # Visit a parse tree produced by CPP14Parser#trailingReturnType.
    def visitTrailingReturnType(self, ctx: CPP14Parser.TrailingReturnTypeContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#pointerOperator.
    def visitPointerOperator(self, ctx: CPP14Parser.PointerOperatorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#cvqualifierseq.
    def visitCvqualifierseq(self, ctx: CPP14Parser.CvqualifierseqContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#cvQualifier.
    def visitCvQualifier(self, ctx: CPP14Parser.CvQualifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#refqualifier.
    def visitRefqualifier(self, ctx: CPP14Parser.RefqualifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#declaratorid.
    def visitDeclaratorid(self, ctx: CPP14Parser.DeclaratoridContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#theTypeId.
    def visitTheTypeId(self, ctx: CPP14Parser.TheTypeIdContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#abstractDeclarator.
    def visitAbstractDeclarator(self, ctx: CPP14Parser.AbstractDeclaratorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#pointerAbstractDeclarator.
    def visitPointerAbstractDeclarator(self, ctx: CPP14Parser.PointerAbstractDeclaratorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#noPointerAbstractDeclarator.
    def visitNoPointerAbstractDeclarator(self, ctx: CPP14Parser.NoPointerAbstractDeclaratorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#abstractPackDeclarator.
    def visitAbstractPackDeclarator(self, ctx: CPP14Parser.AbstractPackDeclaratorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#noPointerAbstractPackDeclarator.
    def visitNoPointerAbstractPackDeclarator(self, ctx: CPP14Parser.NoPointerAbstractPackDeclaratorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#parameterDeclarationClause.
    def visitParameterDeclarationClause(self, ctx: CPP14Parser.ParameterDeclarationClauseContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#parameterDeclarationList.
    def visitParameterDeclarationList(self, ctx: CPP14Parser.ParameterDeclarationListContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#parameterDeclaration.
    def visitParameterDeclaration(self, ctx: CPP14Parser.ParameterDeclarationContext):
        output = ""
        children_iter = iter(ctx.children)
        for i, child in enumerate(children_iter):
            if child.getText() == "string":
                output += "char "
                output += ctx.children[i+1].getText()

                output += "[] "

                #temp = list(declarationStat)
                #temp[position] = new_character
                #declarationStat = "".join(temp)
                # print(declarationStat)
                #output += declarationStat
                next(children_iter)
            elif not child.getChildCount():
                output += child.getText() + " "
            else:
                output += self.visit(child) + " "

        # for child in ctx.children:
        #    if not child.getChildCount():
        #       output += child.getText() + "child "
        #    else:
        #        output += self.visit(child)+ "child "

        #output += "end"
        return output

    # Visit a parse tree produced by CPP14Parser#functionDefinition.
    def visitFunctionDefinition(self, ctx: CPP14Parser.FunctionDefinitionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#functionBody.
    def visitFunctionBody(self, ctx: CPP14Parser.FunctionBodyContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#initializer.
    def visitInitializer(self, ctx: CPP14Parser.InitializerContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#braceOrEqualInitializer.
    def visitBraceOrEqualInitializer(self, ctx: CPP14Parser.BraceOrEqualInitializerContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#initializerClause.
    def visitInitializerClause(self, ctx: CPP14Parser.InitializerClauseContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#initializerList.
    def visitInitializerList(self, ctx: CPP14Parser.InitializerListContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#bracedInitList.
    def visitBracedInitList(self, ctx: CPP14Parser.BracedInitListContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#className.
    def visitClassName(self, ctx: CPP14Parser.ClassNameContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#classSpecifier.
    def visitClassSpecifier(self, ctx: CPP14Parser.ClassSpecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#classHead.
    def visitClassHead(self, ctx: CPP14Parser.ClassHeadContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#classHeadName.
    def visitClassHeadName(self, ctx: CPP14Parser.ClassHeadNameContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#classVirtSpecifier.
    def visitClassVirtSpecifier(self, ctx: CPP14Parser.ClassVirtSpecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#classKey.
    def visitClassKey(self, ctx: CPP14Parser.ClassKeyContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#memberSpecification.
    def visitMemberSpecification(self, ctx: CPP14Parser.MemberSpecificationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#memberdeclaration.
    def visitMemberdeclaration(self, ctx: CPP14Parser.MemberdeclarationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#memberDeclaratorList.
    def visitMemberDeclaratorList(self, ctx: CPP14Parser.MemberDeclaratorListContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#memberDeclarator.
    def visitMemberDeclarator(self, ctx: CPP14Parser.MemberDeclaratorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#virtualSpecifierSeq.
    def visitVirtualSpecifierSeq(self, ctx: CPP14Parser.VirtualSpecifierSeqContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#virtualSpecifier.
    def visitVirtualSpecifier(self, ctx: CPP14Parser.VirtualSpecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#pureSpecifier.
    def visitPureSpecifier(self, ctx: CPP14Parser.PureSpecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#baseClause.
    def visitBaseClause(self, ctx: CPP14Parser.BaseClauseContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#baseSpecifierList.
    def visitBaseSpecifierList(self, ctx: CPP14Parser.BaseSpecifierListContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#baseSpecifier.
    def visitBaseSpecifier(self, ctx: CPP14Parser.BaseSpecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#classOrDeclType.
    def visitClassOrDeclType(self, ctx: CPP14Parser.ClassOrDeclTypeContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#baseTypeSpecifier.
    def visitBaseTypeSpecifier(self, ctx: CPP14Parser.BaseTypeSpecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#accessSpecifier.
    def visitAccessSpecifier(self, ctx: CPP14Parser.AccessSpecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#conversionFunctionId.
    def visitConversionFunctionId(self, ctx: CPP14Parser.ConversionFunctionIdContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#conversionTypeId.
    def visitConversionTypeId(self, ctx: CPP14Parser.ConversionTypeIdContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#conversionDeclarator.
    def visitConversionDeclarator(self, ctx: CPP14Parser.ConversionDeclaratorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#constructorInitializer.
    def visitConstructorInitializer(self, ctx: CPP14Parser.ConstructorInitializerContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#memInitializerList.
    def visitMemInitializerList(self, ctx: CPP14Parser.MemInitializerListContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#memInitializer.
    def visitMemInitializer(self, ctx: CPP14Parser.MemInitializerContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#meminitializerid.
    def visitMeminitializerid(self, ctx: CPP14Parser.MeminitializeridContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#operatorFunctionId.
    def visitOperatorFunctionId(self, ctx: CPP14Parser.OperatorFunctionIdContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#literalOperatorId.
    def visitLiteralOperatorId(self, ctx: CPP14Parser.LiteralOperatorIdContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#templateDeclaration.
    def visitTemplateDeclaration(self, ctx: CPP14Parser.TemplateDeclarationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#templateparameterList.
    def visitTemplateparameterList(self, ctx: CPP14Parser.TemplateparameterListContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#templateParameter.
    def visitTemplateParameter(self, ctx: CPP14Parser.TemplateParameterContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#typeParameter.
    def visitTypeParameter(self, ctx: CPP14Parser.TypeParameterContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#simpleTemplateId.
    def visitSimpleTemplateId(self, ctx: CPP14Parser.SimpleTemplateIdContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#templateId.
    def visitTemplateId(self, ctx: CPP14Parser.TemplateIdContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#templateName.
    def visitTemplateName(self, ctx: CPP14Parser.TemplateNameContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#templateArgumentList.
    def visitTemplateArgumentList(self, ctx: CPP14Parser.TemplateArgumentListContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#templateArgument.
    def visitTemplateArgument(self, ctx: CPP14Parser.TemplateArgumentContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#typeNameSpecifier.
    def visitTypeNameSpecifier(self, ctx: CPP14Parser.TypeNameSpecifierContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#explicitInstantiation.
    def visitExplicitInstantiation(self, ctx: CPP14Parser.ExplicitInstantiationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#explicitSpecialization.
    def visitExplicitSpecialization(self, ctx: CPP14Parser.ExplicitSpecializationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#tryBlock.
    def visitTryBlock(self, ctx: CPP14Parser.TryBlockContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#functionTryBlock.
    def visitFunctionTryBlock(self, ctx: CPP14Parser.FunctionTryBlockContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#handlerSeq.
    def visitHandlerSeq(self, ctx: CPP14Parser.HandlerSeqContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#handler.
    def visitHandler(self, ctx: CPP14Parser.HandlerContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#exceptionDeclaration.
    def visitExceptionDeclaration(self, ctx: CPP14Parser.ExceptionDeclarationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#throwExpression.
    def visitThrowExpression(self, ctx: CPP14Parser.ThrowExpressionContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#exceptionSpecification.
    def visitExceptionSpecification(self, ctx: CPP14Parser.ExceptionSpecificationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#dynamicExceptionSpecification.
    def visitDynamicExceptionSpecification(self, ctx: CPP14Parser.DynamicExceptionSpecificationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#typeIdList.
    def visitTypeIdList(self, ctx: CPP14Parser.TypeIdListContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#noeExceptSpecification.
    def visitNoeExceptSpecification(self, ctx: CPP14Parser.NoeExceptSpecificationContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#theOperator.
    def visitTheOperator(self, ctx: CPP14Parser.TheOperatorContext):
        return self.visitAllChildren(ctx)

    # Visit a parse tree produced by CPP14Parser#literal.
    def visitLiteral(self, ctx: CPP14Parser.LiteralContext):
        output = ""
        if ctx.getText() == "true":
            output += "1 "
            return output
        elif ctx.getText() == "false":
            output += "0 "
            return output
        for child in ctx.children:
            if not child.getChildCount():
                output += child.getText() + " "
            else:
                output += self.visit(child)
        return output


del CPP14Parser
