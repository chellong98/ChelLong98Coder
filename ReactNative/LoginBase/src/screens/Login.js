import React, { Component } from 'react';
import {
    View,
    Text,
    StyleSheet,
    Image,
    TouchableOpacity,
    ScrollView,
    Alert,
} from 'react-native';
import {Container, Header, Left, Button, Icon, Body, Title, Right, Content, Input, Item} from 'native-base';
const username = "admin";
const password = "123";
export default class Login extends Component {

    constructor(props) {
        super(props);
        this.state = {
            username: "",
            password: "",
        }
    }

    login() {
        if(this.state.username===username && this.state.password===password) {
            this.props.navigation.navigate('Home');
        } else {
            Alert.alert('username or password is incorrect');
        }
    }
  render() {
    return (
       <Container>
        <Header>
            <Left>
            <Button transparent>
                <Icon name='menu'/>
            </Button>
            
            </Left>
            <Body>       
                <Title><Icon name='person' style={{color: 'white'}}/>   Login</Title>
            </Body>
        </Header>
        <ScrollView style={styles.container}>
       
            <View style={styles.imageContainer}>
                <Image
                    style={{width: 150, height: 150}}
                    source = {{uri: 'https://techtalk.vn/wp-content/uploads/2016/09/1-frC0VgM2etsVCJzJrNMZTQ-696x696.png'}}
                />
            </View>
            <View style={styles.contentContainer}>
                <Text style={{color: 'rgba(255,250,240,0.6)',}}>Life will be easy if we have Source Code</Text>
            </View>
            <View style={{flex: 3/10 , paddingHorizontal: 10,}}>
               
                    <Item rounded style={styles.input}>
                        <Input 
                        placeholder='Username' 
                        placeholderTextColor='rgba(255,250,240,0.6)' 
                        style={{color: 'white'}}
                        returnKeyLabel = "next"
                        onChangeText = {(text)=>this.setState({username: text})}
                        />
                    </Item>
                    <Item rounded style={styles.input}>
                        <Input 
                        placeholder='Password' 
                        placeholderTextColor='rgba(255,250,240,0.6)' 
                        style={{color: 'white'}}
                        secureTextEntry //danh cho password
                        returnKeyLabel = 'go'
                        onChangeText = {(text)=>this.setState({password: text})}
                        
                        />
                    </Item>              
            </View>
            <View style={styles.buttonContainer}>
                <Button block info style={styles.button} onPress={()=>this.login()}>
                    <Title style={{color: 'rgba(255,250,240,0.7)'}}>Login</Title>
                </Button>
                <Button block info style={styles.button}>
                    <Title style={{color: 'rgba(255,250,240,0.7)'}}>Register</Title>
                </Button>
            </View>
  
        </ScrollView>
       </Container>
    )
  }
};

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#2980b9',
    },
    imageContainer: {
        flex: 3/10,
        // backgroundColor: 'red',
        paddingTop: 10,
        justifyContent: 'center',
        alignItems: 'center',
    },
    contentContainer: {
        flex: 1/10,
        justifyContent: 'center',
        alignItems: 'center',
    },
    input: {
        backgroundColor: '#3742FA',
        // marginHorizontal: '10',s
        marginTop: 10,
        marginBottom: 15,  
    },
    buttonContainer: {
        flex: 3/10,
        // justifyContent: 'center',
        alignItems: 'center',
        paddingHorizontal: 10,
    },
    button: {
        backgroundColor: '#2980b9',
        marginBottom: 20,
    }
});