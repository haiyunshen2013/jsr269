package org.shy.processor;

import com.sun.tools.javac.api.JavacTrees;
import com.sun.tools.javac.processing.JavacProcessingEnvironment;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Names;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;

/**
 * 描述
 *
 * @author shy
 * @since 2022/7/8
 */
public abstract class BaseProcessor extends AbstractProcessor {
    /**
     * 用于在编译器打印消息
     */
    Messager messager;
    /**
     * 语法树
     */
    JavacTrees javacTrees;

    /**
     * 用于构造语法树节点
     */
    TreeMaker treeMaker;

    /**
     * 用户创建标识符对象
     */
    Names names;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        messager = processingEnv.getMessager();
        javacTrees = JavacTrees.instance(processingEnv);
        Context context = ((JavacProcessingEnvironment) processingEnv).getContext();
        treeMaker = TreeMaker.instance(context);
        names = Names.instance(context);
    }
}
