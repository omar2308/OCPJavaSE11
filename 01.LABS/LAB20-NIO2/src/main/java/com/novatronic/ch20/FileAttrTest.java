/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novatronic.ch20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.time.Instant;

/**
 *
 * @author Omar
 */
public class FileAttrTest {
    public static void main(String[] args) throws IOException {
        Path arch = Path.of("attr.txt");
        System.out.println("isDirectory:" + Files.isDirectory(arch));
        System.out.println("isExecutable:" + Files.isExecutable(arch));
        System.out.println("isReadable:" + Files.isReadable(arch));
        System.out.println("isWritable:" + Files.isWritable(arch));
        System.out.println("isHidden:" + Files.isHidden(arch));
        System.out.println("isSymbolicLink:" + Files.isSymbolicLink(arch));
        System.out.println("isRegularFile:" + Files.isRegularFile(arch));
        
        System.out.println("size:" + Files.size(arch));
        System.out.println("getLastModifiedTime:" + Files.getLastModifiedTime(arch));
        
        System.out.println("---------");
        BasicFileAttributes basic = Files.readAttributes(arch, BasicFileAttributes.class);
        System.out.println("lastAccessTime:" + basic.lastAccessTime());
        System.out.println("lastModifiedTime:" + basic.lastModifiedTime());
        
        DosFileAttributes dos = Files.readAttributes(arch, DosFileAttributes.class);
        System.out.println("isSystem:" + dos.isSystem());
        System.out.println("isReadOnly:" + dos.isReadOnly());
        System.out.println("isHidden:" + dos.isHidden());
        
        //no es posix -> excepcion
        //PosixFileAttributes posix = Files.readAttributes(arch, PosixFileAttributes.class);
        //System.out.println("group:" + posix.group());
        
        System.out.println("------------ aributes modified");
        showAttrributes(arch);
        
        BasicFileAttributeView bview = Files.getFileAttributeView(arch, BasicFileAttributeView.class);
        FileTime lastModified = FileTime.fromMillis(
                bview.readAttributes().lastAccessTime().toMillis() + 20_000);
        bview.setTimes(lastModified, null, null);
        
        showAttrributes(arch);
                
    }

    private static void showAttrributes(Path arch) throws IOException {
        
        BasicFileAttributeView bview = Files.getFileAttributeView(arch, BasicFileAttributeView.class);
        System.out.println("creationTime:" + bview.readAttributes().creationTime());
        System.out.println("lastAccessTime:" + bview.readAttributes().lastAccessTime());
        System.out.println("lastModifiedTime:" + bview.readAttributes().lastModifiedTime());
    }
}
