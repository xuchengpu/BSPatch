
cmake_minimum_required(VERSION 3.4.1)

aux_source_directory(bzip2 SOURCE)

add_library(
        bspatch

        SHARED

        native-lib.cpp
        bspatch.c
        ${SOURCE}
)

find_library(
        log-lib

        log)


target_link_libraries(
        bspatch

        ${log-lib})