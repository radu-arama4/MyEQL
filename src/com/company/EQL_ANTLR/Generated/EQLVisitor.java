package com.company.EQL_ANTLR.Generated;// Generated from D:/UTM/SEMESTRUL 4/PBL/MyEQL/src\EQL.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EQLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(EQLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(EQLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(EQLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(EQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(EQLParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(EQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(EQLParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#destination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestination(EQLParser.DestinationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(EQLParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(EQLParser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(EQLParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(EQLParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#sorting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSorting(EQLParser.SortingContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#folder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFolder(EQLParser.FolderContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo(EQLParser.ToContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(EQLParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#cc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCc(EQLParser.CcContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#forwarded}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForwarded(EQLParser.ForwardedContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(EQLParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(EQLParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#attachments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttachments(EQLParser.AttachmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#datevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatevalue(EQLParser.DatevalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#subjectvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubjectvalue(EQLParser.SubjectvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#sortingvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortingvalue(EQLParser.SortingvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#foldervalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFoldervalue(EQLParser.FoldervalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#destinationvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestinationvalue(EQLParser.DestinationvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#bodyvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyvalue(EQLParser.BodyvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#attachementsvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttachementsvalue(EQLParser.AttachementsvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EQLParser#wordlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordlist(EQLParser.WordlistContext ctx);
}