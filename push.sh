#!/bin/bash
echo "push_git.sh start……"
push(){
    # current_date=`date +%F`
    current_date=`date +%F-%T`
    echo "nowDate:$current_date"
    #获取参数
    cd $1
    git add -A
    git commit -m "同步提交，当前日期：$current_date"
    git push origin master
}
#里面是项目地址，每个项目用空格分隔开
project_array=(/dfq/cotton/cottonProject)
for data in ${project_array[@]}  
do  
    echo "project name *************"+${data}+"*************"
    push ${data}
done       
echo "push_git.sh end……"

