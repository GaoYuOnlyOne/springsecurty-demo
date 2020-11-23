spring security02:保存cookie

根据：https://jitwxs.blog.csdn.net/article/details/80249869



当浏览器发起表单登录请求时，当通过 UsernamePasswordAuthenticationFilter 认证成功后，会经过 RememberMeService，在其中有个 TokenRepository，它会生成一个 token，首先将 token 写入到浏览器的 Cookie 中，然后将 token、认证成功的用户名写入到数据库中。

当浏览器下次请求时，会经过 RememberMeAuthenticationFilter，它会读取 Cookie 中的 token，交给 RememberMeService 从数据库中查询记录。如果存在记录，会读取用户名并去调用 UserDetailsService，获取用户信息，并将用户信息放入Spring Security 中，实现自动登陆。