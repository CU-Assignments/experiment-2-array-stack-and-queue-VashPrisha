def simplifyPath(path: str) -> str:
    stack = []
    components = path.split('/')
    
    for component in components:
        if component == '' or component == '.':
            continue
        elif component == '..':
            if stack:
                stack.pop()
        else:
            stack.append(component)
    
    return '/' + '/'.join(stack)

print(simplifyPath("/home/"))         
print(simplifyPath("/../"))           
print(simplifyPath("/home//foo/"))    
print(simplifyPath("/a/./b/../../c/"))
